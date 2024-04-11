	.text
	.file	"program.ll"
	.section	.rodata.cst4,"aM",@progbits,4
	.p2align	2                               # -- Begin function main
.LCPI0_0:
	.long	0x40000000                      # float 2
	.text
	.globl	main
	.p2align	4, 0x90
	.type	main,@function
main:                                   # @main
# %bb.0:
	pushq	%rbx
	subq	$16, %rsp
	movq	scanf_str_int@GOTPCREL(%rip), %rdi
	movq	%rsp, %rsi
	xorl	%eax, %eax
	callq	__isoc99_scanf@PLT
	callq	getchar@PLT
	movl	$5, 12(%rsp)
	movl	$2, 8(%rsp)
	cvtsi2ssl	(%rsp), %xmm0
	addss	.LCPI0_0(%rip), %xmm0
	movss	%xmm0, 4(%rsp)
	cvtss2sd	%xmm0, %xmm0
	movq	printf_str_float32@GOTPCREL(%rip), %rbx
	movq	%rbx, %rdi
	movb	$1, %al
	callq	printf@PLT
	movl	(%rsp), %eax
	addl	$3, %eax
	xorps	%xmm0, %xmm0
	cvtsi2ss	%eax, %xmm0
	movss	%xmm0, 4(%rsp)
	cvtss2sd	%xmm0, %xmm0
	movq	%rbx, %rdi
	movb	$1, %al
	callq	printf@PLT
	xorl	%eax, %eax
	addq	$16, %rsp
	popq	%rbx
	retq
.Lfunc_end0:
	.size	main, .Lfunc_end0-main
                                        # -- End function
	.type	scanf_str_int,@object           # @scanf_str_int
	.section	.rodata,"a",@progbits
	.globl	scanf_str_int
scanf_str_int:
	.asciz	"%d"
	.size	scanf_str_int, 3

	.type	scanf_str_float32,@object       # @scanf_str_float32
	.globl	scanf_str_float32
scanf_str_float32:
	.asciz	"%f"
	.size	scanf_str_float32, 3

	.type	scanf_str_float64,@object       # @scanf_str_float64
	.globl	scanf_str_float64
scanf_str_float64:
	.asciz	"%lf"
	.size	scanf_str_float64, 4

	.type	printf_str_int,@object          # @printf_str_int
	.globl	printf_str_int
printf_str_int:
	.asciz	"%d\n"
	.size	printf_str_int, 4

	.type	printf_str_float32,@object      # @printf_str_float32
	.globl	printf_str_float32
printf_str_float32:
	.asciz	"%f\n"
	.size	printf_str_float32, 4

	.type	printf_str_float64,@object      # @printf_str_float64
	.globl	printf_str_float64
printf_str_float64:
	.asciz	"%fd\n"
	.size	printf_str_float64, 5

	.type	strpi,@object                   # @strpi
	.globl	strpi
strpi:
	.asciz	"%d\n"
	.size	strpi, 4

	.type	strpd,@object                   # @strpd
	.globl	strpd
strpd:
	.asciz	"%f\n"
	.size	strpd, 4

	.type	strs,@object                    # @strs
	.globl	strs
strs:
	.asciz	"%d"
	.size	strs, 3

	.section	".note.GNU-stack","",@progbits
